import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 0. An array to contain the songs: A,B,C,D,E
		 * 1. Loop to read b,n until b=4,n=1
		 * 	1.1. read b,n
		 *  1.2 if b==1,2,3,4  do the respective option n times
		 */
		Scanner sc = new Scanner(System.in);
		char[] songs = {'A','B','C','D','E'};
		int b=0,n=0;
		
		do { // loop until b==4
			b = sc.nextInt(); //read b,n
			n = sc.nextInt();
			if (b==1) {
				moveFirstToEnd(songs, n);
			} else if (b==2) {
				moveLastToFirst(songs, n);
			} else if (b==3) {
				swapFirst2Songs(songs, n);
			} else {
				printList(songs);
			}
		} while (b!=4);
	}

	private static void printList(char[] songs) {
		// TODO Auto-generated method stub
		for (char song:songs) {
			System.out.print(song +" ");
		}
		
	}

	private static void swapFirst2Songs(char[] songs, int n) {
		// TODO Auto-generated method stub
		/*
		 * 1. loop n times
		 * 	1.1 swap the first 2 songs.
		 */
		for (int i=0;i<n;i++) { // loop n times;
			/*
			 * swap the songs;
			 * 1. save the first song to a variable.
			 * 2. move the second song to the first position.
			 * 3. move the saved song to the second position.
			 */
			char first = songs[0];
			songs[0] = songs[1];
			songs[1] = first;
		}
	}

	private static void moveLastToFirst(char[] songs, int n) {
		// TODO Auto-generated method stub
		/*
		 * 1. loop n times:
		 * 	1.1 move the last song to the beginning.
		 * 
		 */
		
		for (int i=0;i<n;i++) { // loop n times;
			/*
			 * 1. save the last song to a variable.
			 * 2. move all songs from last but one position to the next position
			 * 3. move the original last song to the first position.
			 */
			char last = songs[songs.length-1];
			for (int j=songs.length-2; j>=0; j--) { // get song's index by reverse order
				songs[j+1]=songs[j];
			}
			songs[0] = last;
			
		}
		
	}

	private static void moveFirstToEnd(char[] songs, int n) {
		// TODO Auto-generated method stub
		/*
		 * 1. Loop n times
		 * 	1.1 move the first song to the end.
		 */
		
		for (int i=0;i<n;i++) {// loop n times
			// 1. save the first song to a variable.
			// 2. move all songs starting from the second song to the previous position.
			// 3. put the original first song (saved in the variable) to the last position.
			char first = songs[0];
			for (int j=1;j<songs.length;j++) {
				// j is the index of the song to be moved.
				songs[j-1] = songs[j];
			}
			songs[songs.length-1] = first;
		}
	}
	
	

}
