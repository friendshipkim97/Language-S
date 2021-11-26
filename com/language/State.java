package com.language;

import java.util.*;
// State as stack 

// <id, val> 
class Pair {
   Identifier id;
   Value val;
   
   Pair (Identifier id, Value v) {
     this.id = id;
     this.val = v;
   }
}

class State extends Stack<Pair> {
    public State( ) { }
    
    public State(Identifier id, Value val) {
        push(id, val);
    }

    // (1) Push function Implementation
    public State push(Identifier id, Value val) {
    	// Push Implementation
        Pair push = push(new Pair(id, val));

    }

    // (2) Pop function Implementation (Optional)
    public Pair pop() {
    	// Pop Implementation (Optional)
        return this.pop();
    }
    
    // (3) Lookup function Implementation
    public int lookup (Identifier v) {
       // Lookup Implementation
        return this.lookup(v);
    }

    // (4) Set Function Implementation
    public State set(Identifier id, Value val) {
    	// Set Implementation
        return this.set(id, val);
    }
    
    // (5) Get Function Implementation
    public Value get (Identifier id) {
    	// Get Implementation
        return this.get(id);
    }

}