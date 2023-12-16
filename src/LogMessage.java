public class LogMessage
{
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int indexOfColon = message.indexOf(":");
        this.machineId = message.substring(0, indexOfColon);
        this.description = message.substring(indexOfColon + 1);
    }

    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        if(description.equals(keyword))
        {
            return true;
        }
        else if(description.indexOf(keyword + 1) != -1)
        {
            return true;
        }
        else if(description.indexOf(" " + keyword) != -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getMachineId()
    {
        return machineId;
    }

    public String getDescription()
    {
        return description;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}