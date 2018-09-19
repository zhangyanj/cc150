class solution {
    public boolean main(String s) {
        if (s.length() > 255) return false;
        int move = 0;
	for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            if (move&(1<<temp) == 1) {
	    	return false;
            }
	    move|=1<<temp;
	}
	return true;
    }
}
