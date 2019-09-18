package com.kashif.cryptography;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;

public class CreatingDigitalSignature {
	   public static void main(String args[]) throws Exception {
	      String msg = "This is the message to be digitally signed";
	      
	      //Creating KeyPair generator object
	      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");
	      
	      //Initializing the key pair generator
	      keyPairGen.initialize(2048);
	      
	      //Generate the pair of keys
	      KeyPair pair = keyPairGen.generateKeyPair();
	      
	      //Getting the private key from the key pair
	      PrivateKey privKey = pair.getPrivate();
	      
	      //Creating a Signature object
	      Signature sign = Signature.getInstance("SHA256withDSA");
	      
	      //Initialize the signature
	      sign.initSign(privKey);
	      byte[] bytes = msg.getBytes();
	      
	      //Adding data to the signature
	      sign.update(bytes);
	      
	      //Calculating the signature
	      byte[] signature = sign.sign();
	      
	      //Printing the signature
	      System.out.println("Digital signature for given text: "+new String(signature, "UTF8"));
	   }
	}