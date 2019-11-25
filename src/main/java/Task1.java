public class Task1 {
    public boolean xyBalance(String str) {
        int lastX = str.toLowerCase().lastIndexOf('x');
        int lastY = str.toLowerCase().lastIndexOf('y');

        if (lastX == -1) {
            return true;
        }
        if ((lastY != -1 ) && (lastX < lastY)) {
            return true;
        }

        return false;
    }

}
