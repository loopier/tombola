# Tombola

A wheel of fortune for SuperCollider.

# Installation

```
Quarks.install("https://github.com/loopier/tombola");
```


# Usage

```
// boot the server
s.boot;

// start the music
Tombola.musicamaestro;

// spin the wheel...! and watch the Post window. It takes a while, be patient
// you may have to adjust the post window size for it to display correctly.
// increasing the font makes it more dramatic
Tombola.ruleta("Lina", "Ivan", "Julia", "Citlali", "Luka", "Roza sintič", "Katja", "Blaž", "Lola", "Ruže");
```
