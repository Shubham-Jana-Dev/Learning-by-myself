import java.util.ArrayList;

public class Wrapperlnternals {
    public static void main(String[] args) {
        // Autoboxing: Primitive double to Double object transformation
        double primitiveValue = 3.14159;
        Double wrappedObject = primitiveValue;

        // Explicit traditional conversion wrapper call
        Double explicitObject = Double.valueOf(5.89);

        // Auto-unboxing inside numerical statement contexts
        double extractedValue = wrappedObject;

        ArrayList<Integer> sequenceList = new ArrayList<>();
        // Autoboxing primitives directly into generic object collections
        sequenceList.add(100);
        sequenceList.add(200);

        // Unboxing happens during extraction for native execution processing
        int resultSum = sequenceList.get(0) + sequenceList.get(1);

        System.out.println("Wrapped Instance Output: " + wrappedObject);
        System.out.println("Extracted Native Representation: " + extractedValue);
        System.out.println("Collection Extracted Total Processing Sum: " + resultSum);
    }
}