package com.ematrix;


import java.util.Arrays;
import java.util.Iterator;

public class Main {



    }
    /* This code is contributed by Rajat Mishra */









//    int mIndex=lIndex+rIndex-lIndex/2;
//        while(lIndex<=rIndex){
//                if(ary[mIndex]==srcIndex){
//                return mIndex;
//                }
//                if (ary[mIndex]>srcIndex)
//                return binarySearch(ary,lIndex,mIndex-1,srcIndex);
//
//                return binarySearch(ary,mIndex+1,lIndex,srcIndex);
//                }
//
//                return -1;
//    int numStr = str.length();
//    int numPtn = ptn.length();
//    int i = 0;
//    int j = 0;
//    int count;
//    int startIndex = 0;
//    int endIndex = 0;
//    int minLength = numStr;
//    boolean found = false;
//    HashMap<Character, Integer> mpPtn = new HashMap<>();
//
//            if (str.isEmpty() || ptn.isEmpty()) {
//
//                    return "";
//                    }
//
//                    for (int x = 0; x < numPtn; x++) {
//        char c = ptn.charAt(x);
//
//        mpPtn.put(c, mpPtn.getOrDefault(c, 0) + 1);
//
//        }
//
//        count = mpPtn.size();
//
//        while (j < numStr) {
//        char endChar = str.charAt(j++);
//        if (mpPtn.containsKey(endChar)) {
//        mpPtn.put(endChar, mpPtn.get(endChar) - 1);
//        if (mpPtn.get(endChar) == 0) count-=1;
//        }
//
//        if (count > 0) continue;
//
//        while (count == 0) {
//        char startChar = str.charAt(i++);
//        if (mpPtn.containsKey(startChar)) {
//        mpPtn.put(startChar, mpPtn.get(startChar) + 1);
//        if (mpPtn.get(startChar) > 0) count+=1;
//        }
//        }
//
//        if ((j - i) < minLength) {
//        startIndex = i;
//        endIndex = j;
//        minLength = (j - i);
//        found = true;
//        }
//
//
//        }
//
//        if (found) {
//        return str.substring(startIndex-1, endIndex);
//        } else {
//        return "";
//        }


// write your code here
//System.out.println(solution(1000));
//        var fibNums = new ArrayList<Integer>();
//        int prevFib=1,currentFib=2,n=0;
//        int totalValue=0,evenTotal=0;
//        fibNums.add(prevFib);
//        fibNums.add(currentFib);
//        totalValue=(prevFib+currentFib);
//        while(totalValue<4000000){
//            if(fibNums.get(n)%2==0){
//                evenTotal+=fibNums.get(n);
//            }
//                n=n+1;
//                int fibNewValue=(fibNums.get(n)+fibNums.get(n-1));
//                totalValue=fibNums.get(n);
//                fibNums.add(fibNewValue);
//        }
//        System.out.println(fibNums.toString());
//        System.out.print(evenTotal);

//        int n = 9;
//        int count=0;
//        System.out.println(fib(n));
//
//        int x=16;
//        System.out.println(x>>2);
//
//        final int TIMES_TO_FLIP = 20;
//        int heads = 0;
//        int tails = 0;
//        // Create a Random object
//        Random random = new Random();
//        for (int i = 0; i < TIMES_TO_FLIP; i++) {
//            // 0 or 1
//            int result = random.nextInt(2);
//
//            if (result == 1) {
//
//                heads++;
//            } else {
//
//                tails++;
//            }
//        }
//        System.out.println("There were "
//                + heads
//                + " heads and "
//                + tails
//                + " tails");

//        String txt = "Please locate where 'locate' occurs!";
//        System.out.println(factorial(5)); // Outputs 7
//
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collections.sort(cars);
//        for (String car:cars) {
//            System.out.println(car);
//        }

//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//        // Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);


//

//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//
//        // Get the iterator
//        Iterator<String> it = cars.iterator();
//
//        // Print the first item
//        System.out.println(it.next());
//
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

//        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Visit W3Schools!");
//        boolean matchFound = matcher.find();
//        if(matchFound) {
//            System.out.println("Match found");
//        } else {
//            System.out.println("Match not found");
//        }
//
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.forEach( (n) -> { System.out.println(n); } );


//    int[] aryThree= new int[n+m];
//    int i=0;
//    int j=0;
//    int k=0;
//
//        while(i<n && j<m){
//
//                if(aryOne[i]<=aryTwo[j]){
//                   aryThree[k++]=aryOne[i];
//                   i++;//1 2 3
//                    //1 2 4
//                }else{
//                aryThree[k++]=aryTwo[j];
//                //0 2
//                j++;//1 2 3
//                }
//                //ary3 0 2 2 4 5
//                }
//                if(n > i){
//                for(;i<n;i++){
//                aryThree[k++]=aryOne[i];
//                }
//                }
//                if(m > j){
//                for(;j<n;j++){
//                aryThree[k++]=aryOne[j];
//                }
//        }
//        for(int item : aryThree )
//        System.out.println(item);
//
//    int[] aryOne ={8,5,7,1,2,4,6,8};//7
//    int[] aryTwo ={3,5,6,0,2,5};//5
//    ArrayList<Integer> aryThree= new ArrayList<Integer>();
//    for(int item : aryOne){
//            aryThree.add(item);
//            }
//            for(int item : aryTwo){
//            aryThree.add(item);
//            }
//            Collections.sort(aryThree);
//            for( Integer item: aryThree ){
//            System.out.println(item);
//            }

//
//
//    static int fib(int n)
//    {
//
//        if (n <= 1)
//            return n;
//        return fib(n-1) + fib(n-2);
//    }
//
//
//    static Integer solution(int n) {
//        var c = 0;
//        for (var i=1; i < n; i++) {
//            if (0 == i % 3 || 0 == i % 5)
//                c+= i;
//        }
//        return c;
//    }
//
//    private static long factorial(int n)
//    {
//        long answer;
//        System.out.println(n);
//        if (n == 1)
//            return 1;
//        else
//            answer =n * factorial(n-1);
//        System.out.println(n);
//        System.out.println(answer);
//        return answer;
//    }

//    private static  double empSalaryCalculator(double newNumberOfHoursPerWeek,
//                                               double newSalaryPerHour,
//                                               double newVacationDaysTaken){
//        double grossAnnualSalary=0.0;
//        if(newNumberOfHoursPerWeek!=0.0 && newSalaryPerHour!=0.0 ){
//            grossAnnualSalary=(
//                    ((TOTAL_WEEKS*newNumberOfHoursPerWeek)- getVacationHours(newVacationDaysTaken))
//                            *newSalaryPerHour);
//        }
//        return grossAnnualSalary;
//    }
//    private static double getVacationHours(double newVacationDaysTaken){
//        int VACATION_DAYS_HOURS = 8;
//        return (newVacationDaysTaken* VACATION_DAYS_HOURS);
//    }

//    int strL=newStr.length();
//    StringBuilder result = new StringBuilder();
//
//           if(strL<=0){
//                   return "";
//                   }
//
//                   for(int i=0;i<strL;i++){
//        if(strL>i+1){
//        int one = Character.getNumericValue(newStr.charAt(i));
//        int two = Character.getNumericValue(newStr.charAt(i+1));
//
//        if((one%2)==0&&(two%2)==0){
//        //even numbers
//        result.append(newStr.charAt(i)).append("*");
//        continue;
//        }
//        if((one%2)>0&&(two%2)>0){
//        //even odd
//        result.append(newStr.charAt(i)).append("-");
//        continue;
//        }
//        }
//        result.append(newStr.charAt(i));
//        }
//        return result.toString();