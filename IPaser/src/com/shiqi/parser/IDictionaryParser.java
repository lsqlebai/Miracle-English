package com.shiqi.parser;

public interface IDictionaryParser {

	public static interface IDictionaryParseProgressListener {
		void onPrepare(String prompt);

		void onProgress(int progress);

		void onComplete();
	}

	public boolean paserDictionary(String path,
			IDictionaryParseProgressListener listener);

}
