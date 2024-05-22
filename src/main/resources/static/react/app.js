let dom = document.querySelector('#root');
ReactDOM.render(<App></App>, dom);




// App Component.
function App() {
    // 接続する初期urlの設定
    const url = 'http://localhost:8080/api/spot';
    // 初期メッセージの追加
    const [msg, setMsg] = React.useState('Welcome to spot app.');
    // 観光名フィールド
    const [spotName, setSpotName] = React.useState("");
    // 所在地フィールド
    const [spotAddress, setSpotAddress] = React.useState("");
    // 説明フィールド
    const [spotExplanation, setSpotExplanation] = React.useState("");
    // 写真フィールド
    const [spotPicture, setSpotPicture] = React.useState("");
    // ユーザーデータ
    const [data, setData] = React.useState({ id: 0, name: 'no name', mail: 'no mail' });
    // 全てをまとめたやつ
    const [alldata, setAlldata] = React.useState([]);

    // データ一覧の更新
    React.useEffect(() => {
        // データの一覧を取得する
        fetch(url)
            // json形式に変換
            .then(res => res.json())
            .then(res => {
                // 全データ取得用のコンポーネントに入れる
                setAlldata(res);
            });
    }, [msg]);

    // 観光地フィールドの入力
    const doChange1 = (e) => {
        setSpotName(e.target.value);
    }
    // 観光地所在地フィールドの入力
    const doChange2 = (e) => {
        setSpotAddress(e.target.value);
    }

    // 観光地説明テキストエリアの入力
    const doChange3 = (e) => {
        setSpotExplanation(e.target.value);
    }
    // 写真URLフィールドの入力
    const doChange4 = (e) => {
        setSpotPicture(e.target.value);
    }

    // フォームの内容を投稿する
    const doPost = () => {
        fetch(url, {
            method: 'POST',
            mode: 'cors',
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                SpotName: spotName,
                SpatAddress: spotAddress,
                SpotExplanation: spotExplanation,
                spotPicture: spotPicture
            })
        })
            .then(res => res.text())
            .then(res => {
                setMsg('message posted! (id=' + res + ')');
                // ここで皆初期化する
                setSpotName("");
                setSpotAddress("");
                setSpotExplanation("");
                setSpotPicture("");
            });
    }

    return (
        <div>
            <h1 className="bg-secondary text-light p-2">Spot app</h1>
            <div className="container">
                <p className="h5">{msg}</p>
                <table className="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                            <th>ADDRESS</th>
                            <th>EXPLANATION</th>
                            <th>PICTURE</th>
                        </tr>
                    </thead>
                    <tbody>
                        {alldata.map((value, ky) => (
                            <tr key={ky}>
                                <td>{value.SpotId}</td>
                                <td>{value.SpotName}</td>
                                <td>{value.SpotAddress}</td>
                                <td><div>{value.SpotExplanation}</div></td>
                                <td>{value.SpotPicture}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
                <div>
                    <input type="text" className="form-control mb-2" required placeholder="SpotName"
                        onChange={doChange1} value={spotName} />
                </div>
                <div>
                    <input className="form-control mb-2" required placeholder="SpotAddress"
                        onChange={doChange2} value={spotAddress}></input>
                </div>
                <div>
                    <textarea className="form-control mb-2" required placeholder="SpotExplanation"
                        onChange={doChange3} value={spotExplanation}></textarea>
                </div>
                <div>
                    <input type="file" className="form-control mb-2" required placeholder="SpotPicture"
                        onChange={doChange4} value={spotPicture} />
                </div>
                <button className="btn btn-secondary" onClick={doPost}>Regist</button>
                <hr />
                <p className="text-center border-top border-secondary h6 my-4">copyright Tuyano 2021.</p>
            </div>
        </div>
    );
}