$(function () {
  const $tableCust = $("#tableCust").DataTable({
    autoWidth: true,
    scrollY: "100px",
    scrollX: true, //這個一定要設才會正常固定寬
    destroy: true, //Cannot reinitialise DataTable,解决重新加载表格内容问题
    columns: [
      {
        data: "id",
        // orderable: true,
        defaultContent: "",
        width: "50px",
        searchable: true,
        title: "<input type='checkbox' value='11' /> ",
        render: function (data, type, row, meta) {
          return "<input type='checkbox' value='1' />";
        },
      },
      {
        data: "id",
        // orderable: true,
        defaultContent: "",
        width: "100px",
        searchable: true,
        title: "<sapn style='font-size:12pt;;'> 編號 </span>",
        render: function (data, type, row, meta) {
          return "";
        },
      },
      {
        data: "img",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 類型 </span>",
        render: function (data, type, row, meta) {
          return "<img src='" + data + "' />";
          //还可以给图片加上超链接
          //return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 信託 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 身分證號 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 姓名 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 信託 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 出生日 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 英文名 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 國籍 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 職業 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 職稱 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 門牌 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 通訊電話 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 手機 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> EMAIL </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 戶籍地址 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 通訊地址 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 資金來源 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 外國人交易目的 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 指定第三人原因 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 風險等級 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "",
        width: "100px",
        searchable: false,
        title: "<sapn style='font-size:12pt;;'> 比對結果 </span>",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
    ],
    columnDefs: [
      {
        orderable: false,
        targets: [1, 2, 3],
      },
    ],
    language: {
      lengthMenu: "顯示 _MENU_ 筆資料",
      sProcessing: "處理中...",
      sZeroRecords: "没有匹配结果",
      sInfo: "目前有 _MAX_ 筆資料",
      sInfoEmpty: "目前共有 0 筆紀錄",
      sInfoFiltered: " ",
      sInfoPostFix: "",
      sSearch: "尋找:",
      sUrl: "",
      sEmptyTable: "尚未有資料紀錄存在",
      sLoadingRecords: "載入資料中...",
      sInfoThousands: ",",
      oPaginate: {
        sFirst: "首頁",
        sPrevious: "上一頁",
        sNext: "下一頁",
        sLast: "末頁",
      },
      order: [[0, "desc"]],
      oAria: {
        sSortAscending: ": 以升序排列此列",
        sSortDescending: ": 以降序排列此列",
      },
    },
  });
});
