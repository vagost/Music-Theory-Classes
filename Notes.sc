Notes {
	var note, sound, ampthreshold;
	var fullpost, post, hear;



	*new { | note = 0 |
		^super.newCopyArgs(note).init;

	}


	*all { | note = 0 |
		^super.newCopyArgs(note).init1;

	}


	*hear { | sound, ampthreshold = 0.02 |
		^super.newCopyArgs(sound, ampthreshold).init2;

	}


	init {
		//if (note.isNil) { note = 0; };
		^this.makePost;
	}


	init1 {

		^this.makeFullpost;
	}

	init2 {
		if (sound.isNil) { sound = { Mix.new(SoundIn.ar([0,1])); } };
		^this.makeHear;
	}

//Post the note that we want


	makePost {

		^post = {

			NotesComparisons.new(note);

		}.value
	}


//Post all notes


	makeFullpost {

		^fullpost = {

			NotesData.print;

		}.value
	}


	makeHear {

		^hear = {

			NotesTrack.new/*(sound.source, ampthreshold)*/

		}.value
	}


}

