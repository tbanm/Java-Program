package java_objects;

//Encryptable interface
interface Encryptable {
 String encrypt(String data);
 String decrypt(String encryptedData);
}

//AES class implementing Encryptable
class AES implements Encryptable {
 // AES encryption algorithm
 @Override
 public String encrypt(String data) {
     // Implement AES encryption logic here
     // This is a placeholder implementation
     return "AES-encrypted: " + data;
 }

 // AES decryption algorithm
 @Override
 public String decrypt(String encryptedData) {
     // Implement AES decryption logic here
     // This is a placeholder implementation
     if (encryptedData.startsWith("AES-encrypted: ")) {
         return encryptedData.substring("AES-encrypted: ".length());
     } else {
         return "Invalid AES-encrypted data";
     }
 }
}

//RSA class implementing Encryptable
class RSA implements Encryptable {
 // RSA encryption algorithm
 @Override
 public String encrypt(String data) {
     // Implement RSA encryption logic here
     // This is a placeholder implementation
     return "RSA-encrypted: " + data;
 }

 // RSA decryption algorithm
 @Override
 public String decrypt(String encryptedData) {
     // Implement RSA decryption logic here
     // This is a placeholder implementation
     if (encryptedData.startsWith("RSA-encrypted: ")) {
         return encryptedData.substring("RSA-encrypted: ".length());
     } else {
         return "Invalid RSA-encrypted data";
     }
 }
}

public class EncryptionExample {
 public static void main(String[] args) {
     // Create instances of AES and RSA classes
     Encryptable aesEncryptor = new AES();
     Encryptable rsaEncryptor = new RSA();

     // Encrypt and decrypt data using AES
     String data = "Sensitive data to encrypt";
     String aesEncryptedData = aesEncryptor.encrypt(data);
     String aesDecryptedData = aesEncryptor.decrypt(aesEncryptedData);

     System.out.println("AES Encrypted Data: " + aesEncryptedData);
     System.out.println("AES Decrypted Data: " + aesDecryptedData);

     System.out.println();

     // Encrypt and decrypt data using RSA
     String rsaEncryptedData = rsaEncryptor.encrypt(data);
     String rsaDecryptedData = rsaEncryptor.decrypt(rsaEncryptedData);

     System.out.println("RSA Encrypted Data: " + rsaEncryptedData);
     System.out.println("RSA Decrypted Data: " + rsaDecryptedData);
 }
}

