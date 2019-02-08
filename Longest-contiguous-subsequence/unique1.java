// CSC 505 HW1 Program coded by Kalyan Ghosh(unityid: kghosh) and Mohit Satarkar(unityid: mmsatar2)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class unique1 {
	
	public static void getValue() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
         	int numElements = scan.nextInt();
         	int[] orderlist = new int[numElements];

        	for(int i =0; i<numElements; i++)
        	{
            		orderlist[i] = scan.nextInt();
        	}
		int index = 0;
		int maxLength = 0;
		int flag = 0;
		for (int i=0; i<numElements; i++) {
			List<Integer> temp = new ArrayList<>();
			temp.add(orderlist[i]);
			int tempLength=1;
			for (int j=i+1; j<numElements; j++) {
				if(!temp.contains(orderlist[j])) {
					temp.add(orderlist[j]);
					tempLength++;
				}
				else {
					if(tempLength>maxLength) {
						maxLength=tempLength;
						index=i;
						flag=1;
					}
					break;
				}
			}
		}
		if(flag==0) {
			index=0;
			maxLength=numElements;
		}
		
		System.out.println(index + " " + maxLength);
		scan.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		getValue();

	}

}
