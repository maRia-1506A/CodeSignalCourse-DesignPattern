// COMMAND PATTERN 

// TODO: Define the Command interface
// - The interface should have a method called execute()

// TODO: Implement the TextEditor class
// - The class should have two methods: bold() and italic()
// - The bold method should print "Text is bold."
// - The italic method should print "Text is italic."

// TODO: Implement the BoldCommand class
// - The class should implement the Command interface
// - It should have a constructor that initializes a TextEditor object
// - The execute method should call the bold method of the TextEditor object

// TODO: Implement the ItalicCommand class
// - The class should implement the Command interface
// - It should have a constructor that initializes a TextEditor object
// - The execute method should call the italic method of the TextEditor object

// TODO: Implement the TextEditorInvoker class
// - The class should have a Command field to hold the current command
// - Implement the setCommand method to assign a command to the invoker
// - Implement the pressButton method to execute the assigned commandpublic class Main {

// TODO: Create an instance of TextEditor
// TODO: Create instances of BoldCommand and ItalicCommand using the TextEditor instance
// TODO: Create an instance of TextEditorInvoker and use it to execute both commands

public interface Command {
    void execute();

    public static void main(String[] args) {

        // Create TextEditor (Receiver)
        TextEditor editor = new TextEditor();

        // Create Commands
        Command boldCommand = new BoldCommand(editor);
        Command italicCommand = new ItalicCommand(editor);

        // Create Invoker
        TextEditorInvoker invoker = new TextEditorInvoker();

        // Execute Bold
        invoker.setCommand(boldCommand);
        invoker.pressButton();

        // Execute Italic
        invoker.setCommand(italicCommand);
        invoker.pressButton();
    }
}

// Receiver class
class TextEditor {
    public void bold() {
        System.out.println("Text is bold.");
    }

    public void italic() {
        System.out.println("Text is italic.");
    }
}

// Concrete Command for Bold
class BoldCommand implements Command {
    private TextEditor editor;

    public BoldCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.bold();
    }
}

// Concrete Command for Italic
class ItalicCommand implements Command {
    private TextEditor editor;

    public ItalicCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.italic();
    }
}

// Invoker class
class TextEditorInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
