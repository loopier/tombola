# Tombola

A wheel of fortune for SuperCollider.

# Installation

```
Quarks.install("https://github.com/loopier/tombola");
```


# Usage

```
// Boot the server

s.boot;

// Start the music

Tombola.musicamaestro;

// Edit the list of participants below and...
// SPIN THE WHEEL...! 

Tombola.ruleta("Lina", "Ivan", "Niklas", "Turbulente", "Alicia", "Todd", "Luka", "Katja", "Blaž", "Roza sintič", "Lola", "Ruže");

// Watch the Post window. 
// It takes a while, be patient.
// You may have to adjust the Post window size for it to display correctly.
// Increasing the font makes it more dramatic

// Bonus track:
// You can break the tape, make it sound old and crappy, by live coding it.
// The higher the value, the older the tape.

Tombola.tape(0.1); // default value is 0.04
Tombola.tape(0.7);
```
