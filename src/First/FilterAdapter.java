package First;
//创建一个配适器
 class FilterAdapter implements Processor
{
	 Filter filter;
		public FilterAdapter(Filter filter) {
			this.filter=filter;
		}
		public String name() {
			return filter.name();
		}
		public Waveform process(Object input) {return filter.process((Waveform)input);}

}
