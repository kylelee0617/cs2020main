$(function () {
  let $tableBen = $("#tableBen").DataTable({
    autoWidth: false,
//    scrollY: "200px",
    scrollX: true, //這個一定要設才會正常固定大小
    columns: [
      {
        data: "check",
        // orderable: true,
        defaultContent: "",
        width: "10%",
        searchable: true,
        title: "<input type='checkbox' value='11' /> ",
        render: function (data, type, row, meta) {
          return "";
        },
      },
      {
        data: "id",
        // orderable: true,
        defaultContent: "12345",
        width: "150px",
        searchable: true,
        title: "編號",
        render: function (data, type, row, meta) {
          return "";
        },
      },
      {
        data: "img",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "IMAGES",
        render: function (data, type, row, meta) {
          return "<img src='" + data + "' />";
          //还可以给图片加上超链接
          //return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
        render: function (data, type, row, meta) {
          return "<a href='" + data + "'>" + data + "</a>";
        },
      },
      {
        data: "link",
        // orderable: false,
        defaultContent: "12345",
        width: "100px",
        searchable: false,
        title: "LINK",
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
