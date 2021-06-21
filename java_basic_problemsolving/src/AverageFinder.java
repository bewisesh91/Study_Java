public class AverageFinder {
   double computeAverage(int[] intArray) {
       double sum;
       sum = 0;
       for (int i = 0; i < intArray.length; i++) {
           sum += intArray[i];
       }
       double result = sum / intArray.length;
       return result;
   }
}
