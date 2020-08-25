mainTableCols = [{
    checkbox: true
}, {
    field: '',
    title: '期數'
}, {
    field: '',
    title: '款項'
}, {
    field: '',
    title: '款項名稱'
}, {
    field: '',
    title: '百分比'
}, {
    field: '',
    title: '金額(建物)'
}, {
    field: '',
    title: '金額(土地)'
},];

$(function() {
    let $tableCC = $("#tableCC");
    bsTableInit($tableCC, mainTableCols);

    let $btnAddCC = $("#btnAddCC");
    $btnAddCC.click(function() {
        $tableCC.bootstrapTable('insertRow', {
            index: 0,
            row: {
                col1: '',
                col2: '',
                col3: '',
                col4: '',
            }
        });
    });

    let $getTableDataCC = $("#getTableDataCC");
    $getTableDataCC.click(function() {
        alert(JSON.stringify($tableCC.bootstrapTable('getData')));
    });

});