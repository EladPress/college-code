public class ListElement 
{
    public String message;
    public int current_index;
    public ListElement next;
    
    public ListElement(String message, int current_index)
    {
        this.message = message;
        this.next = null;
        this.current_index = current_index;
    }
    
    
}