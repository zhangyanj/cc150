class solution{
    public void main(char[] arr) {
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == '') count++;
	}
	count*=2;
	int fromindex = arr.lrngth+count-1;
	for (int i = arr.length; i>=0; i--) {
	    if (arr[i] != ' ') {
		arr[fromindex--] = '0';
		arr[fromindex--] = '2';
		arr[fromindex--] = '%';
	    } else {
		arr[fromindex--] = arr[i];	
	    }
	}
    }
}
