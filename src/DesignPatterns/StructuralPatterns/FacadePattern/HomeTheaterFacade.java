package DesignPatterns.StructuralPatterns.FacadePattern;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
        this.screen = screen;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        screen.up();
        lights.dim(100);
    }
}
