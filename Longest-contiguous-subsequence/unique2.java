// CSC 505 HW1 Program coded by Kalyan Ghosh(unityid: kghosh) and Mohit Satarkar(unityid: mmsatar2)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet; 

public class unique2 {
	
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
		int start = 0;
		TreeSet<Integer> set = new TreeSet<>();
		set.add(orderlist[0]);
		List<Integer> aux = new ArrayList<>();
		aux.add(orderlist[0]);
		int i = 1;
		int flag = 0;
		
		while(i<numElements) {
			int tempLength = 1;
			
			if(!set.contains(orderlist[i])) {
				set.add(orderlist[i]);
				aux.add(orderlist[i]);
				tempLength++;
				i++;	
				
			}
			else {
				tempLength=i-start;
				flag = 1;
				if(tempLength>maxLength) {
					maxLength=tempLength;
					index=start;
				}
				start++;
				set.clear();
				aux.clear();
				set.add(orderlist[start]);
				aux.add(orderlist[start]);
				i=start+1;
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
