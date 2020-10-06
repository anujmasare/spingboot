package com.home;

import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TestKey {
	public String getKey() {
		SecretKey secretKey= null ;
		String encodedKey ="";
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("AES");
			keyGen.init(256); // for example
			secretKey = keyGen.generateKey();
			encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
			System.out.println(encodedKey);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return encodedKey;
	}
	public static void main(String[] args) {
		TestKey ke= new TestKey();
		ke.getKey();
	}
}
//atgXYZRbnSoBXphA8Pq7zkahR1OIGnxMLy+1E0YQFw=
//YtLOFWZeY29dYS7/Z3xqrA==
//ShVmYq3t6v9y$B&E)H@McQfTjWnZr4u7
//qby/O7W1tfYc5aGzYlQ3V2uI3IE6AQEY3uoMqy/u3dM=