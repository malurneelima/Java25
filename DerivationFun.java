import javax.crypto.KDF;
import javax.crypto.spec.HKDFParameterSpec;

void deriveSecureKey() {
    KDF hkdf = KDF.getInstance("HKDF-SHA256");
    
    AlgorithmParameterSpec params = HKDFParameterSpec.ofExtract()
        .addIKM("user-password".getBytes())
        .addSalt("random-salt".getBytes())
        .thenExpand("app-context".getBytes(), 32);
    
    SecretKey derivedKey = hkdf.deriveKey("AES", params);
    System.out.println("Secure key derived successfully!");
}