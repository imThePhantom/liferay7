CKEDITOR.plugins.add('profileformat', {
	init: function( editor ) {
		var pluginName = 'profileformat'
		editor.ui.addButton( 'profileformat', {
			label: 'Profile format',
			command: 'getFormat',
		});
		var cmd = editor.addCommand('getFormat', { exec: getFormat });
	}
});

function getFormat(e) {
	var pEditor = CKEDITOR.instances.editor1;
	pEditor.insertHtml(
		'<p><strong>Profile</strong></p>' +
			'<ul>' +
				'<li>Birthday:</li>' +
				'<li>Nationality:</li>' +
			'</ul>' +
		'<p><strong>Grow</strong></p>' +
			'<ul>' +
				'<li>&nbsp;</li>' +
			'</ul>' +
		'<p><strong>Prize</strong></p>' +
			'<ul>' +
				'<li>&nbsp;</li>' +
			'</ul>');
}

CKEDITOR.config.toolbar_simple = 
[
 	['profileformat', 'profile']
];