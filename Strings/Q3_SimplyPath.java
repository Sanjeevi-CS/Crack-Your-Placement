import java.util.Stack;

public class Q3_SimplyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String arr[] = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isEmpty()) {
                continue;
            } else if (arr[i].equals("..") && !st.isEmpty()) {
                st.pop();
            } else if (!arr[i].equals("..") && !arr[i].equals(".")) {
                st.push(arr[i]);
            }
        }
        if (st.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop()).insert(0, "/");
        }
        return sb.toString();
    }
}
