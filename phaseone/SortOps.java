package com.phaseone;
import java.io.File;

public class SortOps {
	public void ascendingSort(String path) {
		File directory = new File(path);
        String[] flist = directory.list();
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
        	String temp;
        	int n = flist.length;
        	String[] arr = flist;
        	for (int j = 0; j < n - 1; j++)
            {
                for (int i = j + 1; i < n; i++) 
                {
                    if (arr[j].compareTo(arr[i]) > 0)
                    {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        	for (int i=0; i<n; i++) {
        		System.out.println(arr[i]);
        	}
        }
		
	}
	public void descendingSort(String path) {
		File directory = new File(path);
        String[] flist = directory.list();
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
        	String temp;
        	int n = flist.length;
        	String[] arr = flist;
        	for (int j = 0; j < n - 1; j++)
            {
                for (int i = j + 1; i < n; i++) 
                {
                    if (arr[j].compareTo(arr[i]) < 0)
                    {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        	for (int i=0; i<n; i++) {
        		System.out.println(arr[i]);
        	}
        }
	}
}


