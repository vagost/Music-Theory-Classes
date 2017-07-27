
MTN { //Midi to Note
		var value, post;

		*new { | value = 0 |
			^super.newCopyArgs(value).init;

		}


		init {
				^this.makePost;

		}


		makePost {

			^post = {
				Notes.new(value.midicps);
			}.value

		}

}


// MTN(60)

