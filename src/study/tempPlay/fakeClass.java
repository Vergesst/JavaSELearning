package study.tempPlay;

import java.util.ArrayList;
import java.util.Scanner;

public class fakeClass {
    static class dailyClass{
        String className;
        int start;
        int end;

        public dailyClass(String className, int start, int end) {
            this.className = className;
            this.start = start;
            this.end = end;
        }

        public String getClassName() {
            return className;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<dailyClass> classList = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String cn = sc.next();
            int st = sc.nextInt();
            int ed = sc.nextInt();
            classList.add(new dailyClass(cn,st,ed));
        }
        for(dailyClass dc : classList){
            System.out.println(dc.getClassName() +","+ dc.getStart() +","+ dc.getEnd());
        }
    }
}
