package lesson24.exercise;

public class ToolDAO {
    private Tool[] tools = new Tool[5];

    public Tool save(Tool tool) {
        int index = 0;
        for (Tool t1 : tools) {
            if (t1 == null) {
                tools[index] = tool;
                return tools[index];
            }
            index++;
        }
        return null;
    }
}
