package dev.trie;

/**
 * Created by rthakur on 7/21/17.
 */
public class Trie {

    private TrieNode root;


    public Trie() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("rakesh");

        System.out.println(trie.search("rakeshaa"));

        System.out.println(trie.startsWith("rae"));
//        for(TrieNode a : trie.root.links)
//           if(a!=null) System.out.println(Arrays.toString(a.links));
//        System.out.println(Arrays.toString(trie.root.links));
    }

    public void insert(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            if (!node.containsCharacter(c))
                node.put(c, new TrieNode());
            node = node.get(c);
        }
        node.setIsEnd();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.containsCharacter(c)) {
                node = node.get(c);
            } else {
                return null;
            }
        }
        return node;
    }

    public boolean search(String word) {

        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}



