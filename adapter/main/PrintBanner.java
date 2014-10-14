package main;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public String printWeak() {
		return showWithParen();
	}

	@Override
	public String printStrong() {
		return showWithAster();
	}

}
