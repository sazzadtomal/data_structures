package org.dataStructures.BST;

public class BinarySearchTree {

    private class Node {
        int value;
        Node left;
        Node right;

        private Node(int num){
            this.value=num;
        }

    }


    private Node root;



    public void insert(int value){
      Node node=new Node(value) ;
      if(root==null) {root=node; return;}

      Node traverse=root;

      while(true){
              if(value < traverse.value){
                  if(traverse.left==null){
                      traverse.left=node;
                      return;
                  }
                  traverse=traverse.left;
              }
              else{
                  if(traverse.right==null){
                      traverse.right=node;
                      return;
                  }
                  traverse=traverse.right;
              }
      }
    }


    public Boolean find(int value){

        if(root==null) throw new IllegalArgumentException("tree is empty");

        Node traverse=root;

        while(traverse!=null){
            if(value < traverse.value){traverse=traverse.left;}
            else if(value> traverse.value){traverse=traverse.right;}
            else return true;
        }
        return false;
    }








}
