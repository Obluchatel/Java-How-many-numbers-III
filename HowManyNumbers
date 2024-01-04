import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
class HowManyNumbers {
    public static long findFloor(int numberofDigits, int sum, int minNumber){
        long x = Long.parseLong(String.valueOf(minNumber).repeat(numberofDigits));
        for(long i = x; sumOfDigids(i)!=sum;i++){
            return i;
        }
        return x;
    }
    public static Long findCeil(int numberofDigits, int sum){
        String tempString = "";
        for (long i = 9; i != 0; i--) {
            if (sumOfDigids(Long.parseLong(String.valueOf(i).repeat(numberofDigits)))>=sum) {
                continue;
            }
            for(long x = 0; x<numberofDigits; x++){
                tempString+="1";
            }
            return (i+1)*Long.parseLong(String.valueOf(tempString));
        }
        return 0L;
    };
  
    public static void checkNumberRange(long min, long max, int sum, Set<Long> set) {
        List<Long> numbers = new ArrayList<>();
        for (long i = min; i <= max; i++) {
            if (isAscending(i)) {
                numbers.add(i);
            }
        }
        for (long x : numbers) {
            if (sumOfDigids(x) != sum) {
                continue;
            }
          set.add(x);
        }
    }
  
      public static boolean isAscending(long number) {
        int lastDigit = 10;
        while (number > 0) {
          if (number % 10 > lastDigit) {
            return false;
        }
        lastDigit = (int) (number % 10);
        number /= 10;
    }
    return true;
    }
  
    static int sumOfDigids(long i){
        int tempInt = 0;
         while (i > 0) {
            tempInt += i % 10;
            i /= 10;
    }
        return tempInt;
    }
  
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
    List<Long> result = new ArrayList<>();
    if((double)sumDigits/numDigits>9.0){
        return result;
    }
    Set<Long> set = new LinkedHashSet<>();
    checkNumberRange((findFloor(numDigits,sumDigits,1)), findCeil(numDigits,sumDigits), sumDigits, set);
    result.add((long)set.size());
    result.add(set.iterator().next());
    result.add(new ArrayList<>(set).get(set.size()-1));
    return result;
    }
}
