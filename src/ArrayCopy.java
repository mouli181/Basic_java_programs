public class ArrayCopy {
    public static void main(String[] args) {

                int[] source = {1, 2, 3, 4, 5};

                // Copy using a loop
                int[] destLoop = new int[source.length];
                for (int i = 0; i < source.length; i++) {
                    destLoop[i] = source[i];
                }

                // Copy using System.arraycopy
                int[] destArrayCopy = new int[source.length];
                System.arraycopy(source, 0, destArrayCopy, 0, source.length);

                // Print arrays
                System.out.print("Source: ");
                printArray(source);
                System.out.print("Copied with loop: ");
                printArray(destLoop);
                System.out.print("Copied with System.arraycopy: ");
                printArray(destArrayCopy);
            }

            private static void printArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

