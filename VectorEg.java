import jdk.incubator.vector.*;

void vectorMath() {
    var species = FloatVector.SPECIES_256;
    float[] a = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f};
    float[] b = {2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f};
    float[] result = new float[8];
    
    var va = FloatVector.fromArray(species, a, 0);
    var vb = FloatVector.fromArray(species, b, 0);
    var vc = va.mul(vb); // Vectorized multiplication
    vc.intoArray(result, 0);
}