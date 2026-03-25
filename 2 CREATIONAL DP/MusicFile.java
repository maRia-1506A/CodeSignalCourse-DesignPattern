// TODO: Define the ABSTRACT class MusicFile with an abstract play method
// TODO: Declare the abstract method play()

// TODO: Define MP3File class which extends MusicFile
// TODO: Implement the play method to print "Playing MP3 File."

// TODO: Define WAVFile class which extends MusicFile
// TODO: Implement the play method to print "Playing WAV File."

// TODO: Define FLACFile class which extends MusicFile
// TODO: Implement the play method to print "Playing FLAC File."

// TODO: Define the MusicFileAbstractFactory interface with a createMusicFile method
// TODO: Declare the abstract method createMusicFile()

// TODO: Define MP3FileFactory class which implements MusicFileAbstractFactory
// TODO: Implement the createMusicFile method to return a new MP3File instance

// TODO: Define WAVFileFactory class which implements MusicFileAbstractFactory
// TODO: Implement the createMusicFile method to return a new WAVFile instance

// TODO: Define FLACFileFactory class which implements MusicFileAbstractFactory
// TODO: Implement the createMusicFile method to return a new FLACFile instance

// TODO: Define MusicFileFactory class with a static createMusicFile method
// TODO: Implement the createMusicFile method to utilize a factory to create a music file 

// create a main class 
// Create an MP3 File
// TODO: Create an MP3File using MusicFileFactory and the respective factory
// TODO: Call play method on the created MP3File

// Create a WAV File
// TODO: Create a WAVFile using MusicFileFactory and the respective factory
// TODO: Call play method on the created WAVFile

// Create a FLAC File
// TODO: Create a FLACFile using MusicFileFactory and the respective factory
// TODO: Call play method on the created FLACFile

public abstract class MusicFile {
    public abstract void play();

    public static void main(String[] args) {
        
    }
}

class MP3File extends MusicFile {
    public void play() {
        System.out.println("Playing MP3 File.");
    }
}

class WAVFile extends MusicFile {
    public void play() {
        System.out.println("Playing WAV File.");
    }
}

class FLACFile extends MusicFile {
    public void play() {
        System.out.println("Playing FLAC File.");
    }
}

// interface 
interface MusicFileAbstractFactory {
    MusicFile createMusicFile();
}

class MP3FileFactory implements MusicFileAbstractFactory{
    public MusicFile createMusicFile(){
        return new MP3File();
    }
}

class WAVFileFactory implements MusicFileAbstractFactory{
    public MusicFile createMusicFile(){
        return new WAVFile();
    }
}

class FLACFileFactory implements MusicFileAbstractFactory{
    public MusicFile createMusicFile(){
        return new FLACFile();
    }
}

// main factory class 
class MusicFileFactory {
    public static MusicFile createMusicFile(MusicFileAbstractFactory factory){
        return factory.createMusicFile();
    }
}