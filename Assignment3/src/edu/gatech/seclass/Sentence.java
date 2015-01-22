package edu.gatech.seclass;

public class Sentence implements SentenceInterface {

	private String strSentence="";
	
	/**
     * Sets the value of the current sentence.
     * 
     * @param sentence
     *            The value to be set
     */
	@Override
	public void setSentence(String sentence) {
		// TODO Auto-generated method stub
		this.strSentence = sentence;
	}
    
	 /**
     * Returns the current sentence
     * 
     * @return Current sentence
     */
	@Override
	public String getSentence() {
		// TODO Auto-generated method stub
		return strSentence;
	}
    
	/**
     * Returns the number of words in the current sentence
     * 
     * @return Number of words in the current sentence
     */
	@Override
	public int length() {
		
		return strSentence.split("\\s+").length;
	}
    
	 /**
     * Returns the word at position "position" in the sentence, with 1 being the
     * first position
     * 
     * @param position
     *            Position of the word to return
     * @return The word at position "position"
     * @throws IllegalArgumentException
     *             If "position" is invalid (i.e., "position" <= 0)
     * @throws PositionOutOfBoundsException
     *             If the sentence has less than "position" words in it
     */
	@Override
	public String getWord(int position) throws IllegalArgumentException,
			PositionOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getWords(int startPosition, int endPosition)
			throws IllegalArgumentException, PositionOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(String word) {
		// TODO Auto-generated method stub
		return strSentence.indexOf(word);
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

}
