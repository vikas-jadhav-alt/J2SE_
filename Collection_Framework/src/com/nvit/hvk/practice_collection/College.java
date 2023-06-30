package com.nvit.hvk.practice_collection;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class College {
	//private Student[] student = new Student[60];
	//NITCollection coll = new NITCollection();

//array format with index without mappings
	ArrayList al = new ArrayList();					//IO
	HashSet hs = new HashSet();						//unique objects	
	TreeSet ts = new TreeSet();						//sorting
	PriorityQueue qe = new PriorityQueue();			//FIFO
	Stack stack = new Stack();						//LIFO	
	EnumSet es = EnumSet.allOf(Thread.State.class); //only enum objects
	
//table format with mappings 	
	HashMap hm = new HashMap();
	TreeMap tm = new TreeMap();
	EnumMap em = new EnumMap(Thread.State.class);
	
}
