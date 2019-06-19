package com.java8.learning.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base64 is not encryption -- it's an encoding. It's a way of representing
 * binary data using only printable (text) characters. While encoding the user
 * name and password with the Base64 algorithm typically makes them unreadable
 * by the naked eye, they are as easily decoded as they are encoded. Security is
 * not the intent of the encoding step. Rather, the intent of the encoding is to
 * encode non-HTTP-compatible characters that may be in the user name or
 * password into those that are HTTP-compatible.
 */
public class Base64EncodeDecode {

	public static void main(String args[]) {

		try {
			final String sampleString = "subjects?abcd";
			final String mimeString = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwebvbvvbvrtyuiopasdfghjklzxcvbnmqwertyuiop";
			System.out.println("Original String: " + sampleString);

			// Encode using basic encoder
			// Uses A-Z,a-z,0-9,+and/ characters after Encoding
			String base64encodedString = Base64.getEncoder().encodeToString(sampleString.getBytes("utf-8"));
			System.out.println("Base64 Encoded String (Basic): " + base64encodedString);
			// Decode
			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
			System.out.println("Base64 Decoded String (Basic): " + new String(base64decodedBytes, "utf-8"));

			// Encode using URL encoder
			// Uses A-Z,a-z,0-9,-and_ characters after Encoding
			String base64UrlencodedString = Base64.getUrlEncoder().encodeToString(sampleString.getBytes("utf-8"));
			System.out.println("Base64 Encoded String (URL): " + base64UrlencodedString);
			byte[] base64UrldecodedBytes = Base64.getUrlDecoder().decode(base64UrlencodedString);
			System.out.println("Base64 Decoded String (URL): " + new String(base64UrldecodedBytes, "utf-8"));

			// Encode using Mime encoder
			// If the encoded value contains more than 76 characters, it splits and writes
			// the encoded value in next line
			String base64MimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeString.getBytes("utf-8"));
			System.out.println("Base64 Encoded String (MIME): " + base64MimeEncodedString);
			byte[] base64MimeDecodedString = Base64.getMimeDecoder().decode(base64MimeEncodedString);
			System.out.println("Base64 Decoded String (MIME): " + new String(base64MimeDecodedString, "utf-8"));

		} catch (UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error :" + e.getMessage());
		}
	}

}
