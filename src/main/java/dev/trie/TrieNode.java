package dev.trie;

/**
 * Created by rthakur on 7/21/17.
 * https://leetcode.com/problems/implement-trie-prefix-tree/#/solution
 */
public class TrieNode {

    private TrieNode[] links;

    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[26]; // to hold characters a-z
    }

    public boolean containsCharacter(char ch) {
        return links[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    public void setIsEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }

}
