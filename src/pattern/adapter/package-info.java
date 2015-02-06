/**
 * <h1>Design Patterns - Adapter Pattern</h1>
 *
 * <p>
 * Adapter pattern works as a bridge between two incompatible interfaces. This type of design
 * pattern comes under structural pattern as this pattern combines the capability of two independent
 * interfaces.
 * </p>
 *
 * <p>
 * This pattern involves a single class which is responsible to join functionalities of independent
 * or incompatible interfaces. A real life example could be a case of card reader which acts as an
 * adapter between memory card and a laptop. You plugin the memory card into card reader and card
 * reader into the laptop so that memory card can be read via laptop.
 * </p>
 *
 * <p>
 * We are demonstrating use of Adapter pattern via following example in which an audio player device
 * can play mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4
 * files.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We have a MediaPlayer interface and a concrete class AudioPlayer implementing the MediaPlayer
 * interface. AudioPlayer can play mp3 format audio files by default.
 * </p>
 *
 * <p>
 * We are having another interface AdvancedMediaPlayer and concrete classes implementing the
 * AdvancedMediaPlayer interface. These classes can play vlc and mp4 format files.
 * </p>
 *
 * <p>
 * We want to make AudioPlayer to play other formats as well. To attain this, we have created an
 * adapter class MediaAdapter which implements the MediaPlayer interface and uses
 * AdvancedMediaPlayer objects to play the required format.
 * </p>
 *
 * <p>
 * AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing
 * the actual class which can play the desired format. AdapterPatternDemo, our demo class will use
 * AudioPlayer class to play various formats.
 * </p>
 *
 * <img src="./adapter_pattern_uml_diagram.jpg" alt="Adapter Pattern UML Diagram.jpg" width="100%">
 */
package pattern.adapter;