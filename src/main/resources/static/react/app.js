let dom = document.querySelector('#root');
ReactDOM.render(<App></App>, dom);

function App(){
	
	return (
		<div>
			<h1>Sample Text</h1>
			<p>ここはサンプルメッセージです。</p>
		</div>
	);
}