function remover(id) {
    $.ajax({
        url: `usuario?id=${id}`,
        type: 'DELETE',
        success: function(response) {
          window.location.reload();
        },
        error: function (response) {
          alert('Erro ao excluir usuário. Tente novamente');
        }
     });
}