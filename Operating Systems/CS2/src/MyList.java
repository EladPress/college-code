public class MyList 
{
      private ListElement rootElement;
      private ListElement lastElement;
      private int current_index;
      public MyList()
      {
          rootElement = null;
          lastElement = null;
          current_index = 0;
      }
      
      public synchronized void add(String message)
      {
          
              ListElement element = new ListElement(message, this.current_index);
              if (rootElement == null)
              {
                  // Root element is null so let's set the root to the element just created as its the first element
                  rootElement = element;
                  lastElement = element;
              }
              else
              {
                  // Set the next element to our newly created element
                  lastElement.next = element;
                  // Replace the lastElement variable ( the tail ) with the newly created element
                  lastElement = lastElement.next;
              }
              // Increment the current index
              this.current_index += 1;
              printList();// possible DEADLOCK !
          
      }
      
      public synchronized void printList()
      {
          
              ListElement current = rootElement;
              while(current != null)
              {
                  System.out.println(String.valueOf(current.current_index) + " : " + current.message);
                  current = current.next;
              }
          
      }
      
      public ListElement getRootElement()
      {
          return rootElement;
      }
}