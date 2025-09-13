import java.util.*;
class main{
static void findThreeLargest(int arr[]){
Set<Integer> set = new HashSet<>();
for(int num : arr){
set.add(num);
}
List<Integer> list = new ArrayList<>(set);
Collections.sort(list, Collections.reverseOrder());
System.out.println("top three largest distinct integers in the array are: ");
int count = 0;
for(int i = 0; i < list.size() && count < 3; i++){
System.out.println(list.get(i));
count++;
}
if (list.size()<3)
	System.out.print("less than 3 no present in array");
}
public static void main(String[] args){
int arr[] = {12, 23, 45, 67, 34, 78, 56, 89};
findThreeLargest(arr);
}
}
