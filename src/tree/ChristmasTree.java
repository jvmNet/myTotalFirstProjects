package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasTree {
    private static StringBuilder allBranch;
    private static char[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size christmas tree: " + " ");
        int sizeTree = Integer.parseInt(reader.readLine());

        StringBuilder leftBranch = new StringBuilder();
        StringBuilder rightBranch = new StringBuilder();

        int centreLeft = sizeTree;
        int centreRight = 1;
        for(int i = 0; i < sizeTree; i++){
            leftBranch.delete(0, leftBranch.length());
            rightBranch.delete(0, rightBranch.length());

            tree = new char[sizeTree];
            for(int c = 0; c < tree.length; c++){
                tree[c] = (char) (60 + new Random().nextInt(3));
            }

            allBranch = new StringBuilder();
            allBranch.append(tree);

            for(int branch = 0; branch < centreLeft; branch++){
                String oneElement = " ";
                if(branch < centreLeft)
                    leftBranch.append(oneElement);
                if(branch == centreLeft - 1)
                    leftBranch.append(allBranch.substring(branch, sizeTree));
            }

            rightBranch.append(allBranch.substring(0, centreRight));

            try{
                Thread.sleep(50);
            } catch (Exception e){
                e.getStackTrace();
            }

            System.out.println(leftBranch.toString() + rightBranch.toString());

            centreLeft--;
            centreRight++;
        }
    }
}
