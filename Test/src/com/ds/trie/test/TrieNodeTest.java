package com.ds.trie.test;

import com.ds.trie.Trie;

public class TrieNodeTest {
	
	
	public static void main(String ar[]) {
		Trie t = new Trie();
		t.insertWord("test");
		t.insertWord("testing");
		t.insertWord("car");
		t.insertWord("cab");
		t.insertWord("cart");
		
		boolean result = t.searchWord("cab");
		boolean result1 = t.searchWord("cal");
		int i = 0;
	}

}
