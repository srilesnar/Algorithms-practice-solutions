package com.ds.trie;


public class TrieNode {
	char c;
	TrieNode[] children;
	boolean isLeaf;
	
	public TrieNode(char c) {
		this.c = c;
		this.isLeaf = false;
		children = new TrieNode[26];
	}

}
