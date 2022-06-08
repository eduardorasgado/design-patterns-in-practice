package structural.Decorator.FileProcesingExample;

import java.util.HashMap;
import java.util.Map;

public class ReverseEncryptor implements Encryptor{
	private final Map<String, String> CYPHER_BASE;
	
	public ReverseEncryptor() {
		CYPHER_BASE = new HashMap<>();
		CYPHER_BASE.put(" ", "1");
		CYPHER_BASE.put("a", "2");
		CYPHER_BASE.put("b", "3");
		CYPHER_BASE.put("c", "4");
		CYPHER_BASE.put("d", "5");
		CYPHER_BASE.put("e", "6");
		CYPHER_BASE.put("f", "7");
		CYPHER_BASE.put("g", "8");
		CYPHER_BASE.put("h", "9");
		CYPHER_BASE.put("i", "0");
		CYPHER_BASE.put("j", "O");
		CYPHER_BASE.put("k", "P");
		CYPHER_BASE.put("l", "Q");
		CYPHER_BASE.put("m", "R");
		CYPHER_BASE.put("n", "S");
		CYPHER_BASE.put("n", "A");
		CYPHER_BASE.put("o", "B");
		CYPHER_BASE.put("p", "C");
		CYPHER_BASE.put("q", "D");
		CYPHER_BASE.put("r", "E");
		CYPHER_BASE.put("s", "F");
		CYPHER_BASE.put("t", "G");
		CYPHER_BASE.put("u", "H");
		CYPHER_BASE.put("v", "J");
		CYPHER_BASE.put("w", "K");
		CYPHER_BASE.put("x", "L");
		CYPHER_BASE.put("y", "M");
		CYPHER_BASE.put("z", "N");
		
	}
	
	@Override
	public String encrypt(String message) {
		char[] messageArray = getMessageArray(message);
		
		String encryptedMessage = "";
		for(int i = 0; i < message.length(); i++) {
			String letter = "" + messageArray[i];
			encryptedMessage += CYPHER_BASE.get(letter);
		}
		
		return encryptedMessage;
	}

	@Override
	public String decrypt(String message) {
		char[] messageArray = getMessageArray(message);
		
		String decryptedMessage = "";
		for(int i = 0; i < message.length(); i++) {
			
			decryptedMessage += decryptLetter(messageArray[i]);
		}
		return decryptedMessage;
	}

	private char[] getMessageArray(String message) {
		char[] messageArray = new char[message.length()];
		message.getChars(0, message.length(), messageArray, 0);
		return messageArray;
	}
	
	private String decryptLetter(char messageChar) {
		String decryptedLetter = "";
		for(Map.Entry<String, String> letterEntry : CYPHER_BASE.entrySet()) {
			String letterString = "" + messageChar;
			if(letterEntry.getValue().equals(letterString)) {
				decryptedLetter = letterEntry.getKey();
				break;
			}
		}
		return decryptedLetter;
	}
}
