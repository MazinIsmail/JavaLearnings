package com.java8.learning.base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Base64;

public class Base64EncodeDecode {

	public static void main(String args[]) {

		try {
			final String sampleString = "Hello World\\@@@lkhgjhgujhfgfhgfmjnhbgvcfdtyuhnjkloiu\nhgfdrcxdsertgbhcxsrtghjknhf++_\n";
			System.out.println("Original String: " + sampleString);
			// final String filePath =
			// "C:\\Users\\MA20011300\\Documents\\RequestItem.hbm3.xml";

			// Encode using basic encoder
			String base64encodedString = Base64.getEncoder().encodeToString(sampleString.getBytes("utf-8"));
			System.out.println("Base64 Encoded String (Basic): " + base64encodedString);
			// Decode
			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
			System.out.println("Base64 Decoded String (Basic): " + new String(base64decodedBytes, "utf-8"));

			// Encode using URL encoder
			String base64UrlencodedString = Base64.getUrlEncoder().encodeToString(sampleString.getBytes("utf-8"));
			System.out.println("Base64 Encoded String (URL): " + base64UrlencodedString);
			byte[] base64UrldecodedBytes = Base64.getUrlDecoder().decode(base64UrlencodedString);
			System.out.println("Base64 Decoded String (URL): " + new String(base64UrldecodedBytes, "utf-8"));

			// Encode using Mime encoder
			String base64MimeEncodedString = Base64.getMimeEncoder().encodeToString(sampleString.getBytes("utf-8"));
			System.out.println("Base64 Encoded String (MIME): " + base64MimeEncodedString);
			byte[] base64MimeDecodedString = Base64.getMimeDecoder().decode(base64MimeEncodedString);
			System.out.println("Base64 Decoded String (MIME): " + new String(base64MimeDecodedString, "utf-8"));

			// byte[] fileContent = readFileToByteArrayNew(filePath);
			// String fileEncodedString = Base64.getEncoder().encodeToString(fileContent);
			// System.out.println("Base64 Encoded File (Basic): " + fileEncodedString);
			// byte[] fileDecodedString = Base64.getDecoder().decode(fileEncodedString);
			// System.out.println("Base64 Decoded File (Basic): " + new
			// String(fileDecodedString, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error :" + e.getMessage());
		}
	}

	private static byte[] readFileToByteArrayNew(String filePath) throws IOException {
		File file = new File(filePath);
		return Files.readAllBytes(file.toPath());
	}

	private static byte[] readFileToByteArray(String filePath) {
		FileInputStream fileInputStream = null;
		byte[] bytesArray = null;
		try {
			File file = new File(filePath);
			bytesArray = new byte[(int) file.length()];
			// read file into bytes[]
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bytesArray);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return bytesArray;
	}

}
